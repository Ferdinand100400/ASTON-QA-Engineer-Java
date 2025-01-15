package Lesson_6;

public class Main {

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {

        String[][] str1 = {{"5", "1", "10", "7"}, {"1", "8", "2", "5"}, {"1", "8", "2", "5"}, {"1", "8", "2", "5"}};
        String[][] str2 = {{"5", "1"}, {"2", "5"}};
        String[][] str3 = {{"5", "1", "10", "7"}, {"one", "8", "2", "5"}, {"1", "8", "2", "5"}, {"1", "8", "2", "5"}};

        try {
            System.out.println(sumStringArray(str3));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int sumStringArray(String[][] arrStr) throws MyArraySizeException, MyArrayDataException{
        if ((arrStr[0].length != 4) || (arrStr[1].length != 4)) {
            throw new MyArraySizeException("Размер масива не соотвествует 4х4");
        }
        Integer[][] arrInt = new Integer[arrStr[0].length][arrStr[1].length];
        int  sum = 0;
        for (int i = 0; i < arrStr[0].length; i++) {
            for (int j = 0; j < arrStr[1].length; j++) {
                try {
                    arrInt[i][j] = Integer.parseInt(arrStr[i][j]);
                    sum += arrInt[i][j];
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неудалось преобразовать строку в число в ячейке: [" + i + "] [" + j + "]");
                }
            }
        }
        return sum;
    }
}
