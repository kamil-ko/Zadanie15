package pl.kamil;

public class Zadanie15 {

    public Number[] getNumbers() {
        Number[] numbers = new Number[10];
        for (int i = 0; i < 10; i++) {
            int value = ScannerUtils.getFromScannerInt("Podaj liczbę numer " + (i+1));
            boolean find = false;
            for (Number number : numbers) {

                if (number!=null && number.getValue() == value) {
                    number.setCounter(number.getCounter() + 1);
                    find = true;
                }
            }
            if (!find) {
                numbers[i] = new Number(value, 1);

            }
        }
        return numbers;
    }

    public void printNumbers(Number[] numbers) {
        for (Number number : numbers) {
            if (number!=null && number.getCounter() > 1) {
                System.out.println(number.getValue());
            }

        }

    }

}
