package level2.hw3;

public class Numbers {
    private int number;

    public Numbers(int number) {
        this.number = number;
    }

    public int getNumbers() {
        return number;
    }

    public void setNumbers(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Numbers number1 = (Numbers) o;

        return number == number1.number;
    }

    @Override
    public int hashCode() {
        return number;
    }
}
