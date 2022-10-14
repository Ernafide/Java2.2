public class Main {
    public static void main(String[] args) {
        int account = 50; // Исходное количество денег на счету
        int depositAmount = 1100; // Сумма пополнения
        int rubleBall = 100; // Колличество рублей за 1 балл
        if (depositAmount > 1000) {
            int ball = depositAmount / rubleBall;
            int result = account + depositAmount + ball;
            System.out.println("Количество денег на счету " + result);
            System.out.println("Количество начисленных балов " + ball);

        }
        if (depositAmount < 1000) {
            int notBall = 0;
            int notResult = account + depositAmount;
            System.out.println("Количество денег на счету " + notResult);
            System.out.println("Количество начисленных балов " + notBall);

        }
    }
}