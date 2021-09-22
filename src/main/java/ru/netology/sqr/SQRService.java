package ru.netology.sqr;

public class SQRService {

    public int getAmountSquaresInRange(int begin, int end) {
        int minNumber = 10;
        int maxNumber = 99;

        int amountSquares = 0;
        for (int i = minNumber; i <= maxNumber; i++) {
            int square = i * i;
            if (square >= begin && square <= end) {
                amountSquares++;
            } else if (square > end) {
                break;
            }
        }

        return amountSquares;
    }

}
