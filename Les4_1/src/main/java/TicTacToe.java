import java.util.Random;
import java.util.Scanner;

    public class TicTacToe {
        static char[][] tttMap;
        static Scanner sc = new Scanner(System.in);
        private static final int ROW_LENGTH = 3;
        private static final int MAP_LENGTH = 3;
        private static final int MAP_WIDTH = 3;
        private static final char EMPTY_DOT = '⏺';
        private static final char X_DOT = 'X';
        private static final char O_DOT = 'O';
        private static final int AI_LVL = 1;

        public static void main(String[] args) {
            startGame();
        }

        private static void startGame() {
            initTTTMap(MAP_LENGTH, MAP_WIDTH);
            doTTTMap();
            int count = 0;
            while(true) {
                humanTurn();
                ++count;
                doTTTMap();
                if (checkWin(X_DOT, tttMap, EMPTY_DOT, ROW_LENGTH)) {
                    System.out.println("Pobeda!");
                    break;
                }
                if (count == tttMap.length * tttMap[0].length) {
                    System.out.println("DRAW");
                    break;
                }
                computerTurn(tttMap, X_DOT, O_DOT, AI_LVL);
                ++count;
                doTTTMap();
                if (checkWin(O_DOT, tttMap, EMPTY_DOT, ROW_LENGTH)) {
                    System.out.println("you LOSE!");
                    break;
                }

                if (count == tttMap.length * tttMap[0].length) {
                    System.out.println("DRAW");
                    break;
                }
            }
        }

        private static boolean checkWin(char inputForCheck, char[][] massive, char emptySign, int checkCount) {
            int countX1 = 0;
            int countX2 = 0;

            int i;
            int count;
            int j;
            char a;
            for(i = 0; i < massive.length; ++i) {
                count = 0;

                for(j = 0; j < massive[i].length; ++j) {
                    a = massive[i][j];
                    if (a != emptySign && a == inputForCheck) {
                        ++count;
                    }

                    if (i == j && a == inputForCheck) {
                        ++countX1;
                    }

                    if (i == j && massive[i][massive[i].length - 1 - i] == inputForCheck) {
                        ++countX2;
                    }

                    if (count == checkCount || countX1 == checkCount || countX2 == checkCount) {
                        return true;
                    }
                }
            }

            for(i = 0; i < massive.length; ++i) {
                count = 0;

                for(j = 0; j < massive[i].length; ++j) {
                    a = massive[j][i];
                    if (a != emptySign && a == inputForCheck) {
                        ++count;
                    }
                    if (count == checkCount) {
                        return true;
                    }
                }
            }
            return false;
        }

        private static void computerTurn(char[][] massive, char inputForCheck, char computerCell, int aiLevel) {
            System.out.println("next turn");
            int x = 0;
            int y = 0;
            boolean checkCell = false;
            boolean exit = false;
            Random random = new Random();

            do {
                if (exit) {
                    x = random.nextInt(massive.length);
                    y = random.nextInt(massive.length);
                    checkCell = isValidCell(x, y);
                } else {
                    int countX1 = 0;
                    int countX2 = 0;

                    int i;
                    byte count;
                    int j;
                    char a;
                    int k;
                    for(i = 0; i < massive.length; ++i) {
                        count = 0;

                        for(j = 0; j < massive[i].length; ++j) {
                            a = massive[i][j];
                            if (i == j && a == inputForCheck) {
                                ++countX1;
                            }
                            if (i == j && massive[i][massive[i].length - 1 - i] == inputForCheck) {
                                ++countX2;
                            }
                            if (count == aiLevel || countX1 == aiLevel || countX2 == aiLevel) {
                                for(k = aiLevel + 1; k != 0; --k) {
                                    if (checkCell = isValidCell(i + k, j + k)) {
                                        x = i + k;
                                        y = j + k;
                                        massive[x][y] = computerCell;
                                        checkCell = isValidCell(x, y);
                                    }
                                }
                                exit = true;
                            }
                        }
                    }
                    for(i = 0; i < massive.length; ++i) {
                        count = 0;

                        for(j = 0; j < massive[i].length; ++j) {
                            a = massive[j][i];
                            if (count == aiLevel) {
                                for(k = aiLevel + 1; k != 0; --k) {
                                    if (checkCell = isValidCell(i + k, j + k)) {
                                        x = i + k;
                                        y = j + k;
                                        massive[x][y] = computerCell;
                                        checkCell = isValidCell(x, y);
                                    }
                                }
                                exit = true;
                            }
                        }
                    }
                }
            } while(!checkCell);
            massive[x][y] = computerCell;
        }
        private static void humanTurn() {
            int x = -1;
            int y = -1;

            boolean checkSell;
            do {
                System.out.println("Вводить координаты в формате (X;Y)");
                if (sc.hasNextInt()) {
                    x = sc.nextInt() - 1;
                }
                if (sc.hasNextInt()) {
                    y = sc.nextInt() - 1;
                }
                checkSell = isValidCell(x, y);
                sc.nextLine();
            } while(!checkSell);
            tttMap[x][y] = X_DOT;
        }

        static boolean isValidCell(int x, int y) {
            if (x >= 0 && y >= 0 && x <= tttMap.length && y <= tttMap[0].length) {
                return true;
            } else {
                return false;
            }
        }
        private static void initTTTMap(int length, int width) {
            if (length < 3 || width < 3) {
                System.out.println("  no way, min field 3x3 ");
            }

            tttMap = new char[length][width];

            for(int i = 0; i < tttMap.length; ++i) {
                for(int j = 0; j < tttMap[i].length; ++j) {
                    tttMap[i][j] = EMPTY_DOT;
                }
            }
        }
        private static void doTTTMap() {
            for(int i = 0; i < tttMap.length; ++i) {
                for(int j = 0; j < tttMap[i].length; ++j) {
                    System.out.print(tttMap[i][j] + " ");
                }

                System.out.println();
            }
        }
    }