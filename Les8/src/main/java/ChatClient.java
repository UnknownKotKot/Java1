import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

    public class ChatClient extends JFrame {

        private JTextField jInputMessageHere;
        private JTextField jInputNameHere;
        private JTextArea jChatField;
        private String userName = "";

        public ChatClient() {

            setBounds(640, 480, 640, 480);
            setTitle("Chat ver: 0.1");
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            jChatField = new JTextArea();
            jChatField.setEditable(false);
            jChatField.setLineWrap(true);

            JScrollPane jsp = new JScrollPane(jChatField);
            add(jsp, BorderLayout.CENTER);

            JLabel jlYourMessages = new JLabel("Ваши сообщения: ");
            add(jlYourMessages, BorderLayout.NORTH);

            JPanel bottomPanel = new JPanel(new BorderLayout());
            add(bottomPanel, BorderLayout.SOUTH);

            JButton jbSendMessage = new JButton("Отправить");
            bottomPanel.add(jbSendMessage, BorderLayout.EAST);

            jInputMessageHere = new JTextField("Введите ваше сообщение: ");
            bottomPanel.add(jInputMessageHere, BorderLayout.CENTER);

            jInputNameHere = new JTextField("Введите ваше имя: ");
            bottomPanel.add(jInputNameHere, BorderLayout.WEST);

            //для кнопки
            jbSendMessage.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //првоерка поля на наличие введенных данных
                    if (!jInputMessageHere.getText().trim().isEmpty() && !jInputNameHere.getText().trim().isEmpty()) {
                        userName = jInputNameHere.getText();
                        sendMsg();
                        jInputMessageHere.grabFocus();
                    }
                }
            });

            //очистка поля для сообщения после ввода
            jInputMessageHere.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    jInputMessageHere.setText("");
                }
            });

            //очистка поля для имени после ввода
            jInputNameHere.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    jInputNameHere.setText("");
                }
            });

            //для отпраки нажатием Enter
            jInputMessageHere.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //првоерка поля на наличие введенных данных
                    if (!jInputMessageHere.getText().trim().isEmpty() && !jInputNameHere.getText().trim().isEmpty()) {
                        userName = jInputNameHere.getText();
                    sendMsg();
                    jInputMessageHere.setText("");
                    }
                }
            });

            setVisible(true);
        }

        // отправка сообщения c сохранением истории
        String messageStr = "";
        public void sendMsg() {
            messageStr = messageStr.concat(jInputNameHere.getText() + "" + ":" + jInputMessageHere.getText() + "\n");
            jChatField.setText(messageStr);
        }
    }
