public class BinOps {
    public String sum(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, сложите и переведите
      обратно в двоичную запись*/
        int x = 0;
        int y = 0;
        String errMsg = null;
        try {
            x = Integer.parseInt(a, 2);
        } catch (NumberFormatException e) {
            // если функционал фасада ограничивается выводом результата,
            // который далее не принимает участия в расчётах,
            // достаточно вывести сообщение об ошибке вместо результата.
            errMsg = e.getLocalizedMessage();
        }
        try {
            y = Integer.parseInt(b, 2);
        } catch (NumberFormatException e) {
            errMsg = errMsg != null ?
                    errMsg + ", а также " + e.getLocalizedMessage() :
                    e.getLocalizedMessage();
        }

        if (errMsg != null) {
            return "Неверный формат: " + errMsg;
        }

        return Integer.toBinaryString(x + y);
    }

    public String mult(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, перемножьте и переведите
      обратно в двоичную запись*/
        int x = 0;
        int y = 0;
        String errMsg = null;
        try {
            x = Integer.parseInt(a, 2);
        } catch (NumberFormatException e) {
            errMsg = e.getLocalizedMessage();
        }
        try {
            y = Integer.parseInt(b, 2);
        } catch (NumberFormatException e) {
            errMsg = errMsg != null ?
                    errMsg + ", а также " + e.getLocalizedMessage() :
                    e.getLocalizedMessage();
        }
        if (errMsg != null) {
            return "Неверный формат: " + errMsg;
        }
        return Integer.toBinaryString(x * y);
    }
}
