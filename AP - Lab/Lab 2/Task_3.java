class Member {
    String name;
    int memberShipMonths;
    double monthlyFee;

    void setMember(String n, int months, double fee) {
        name = n;
        memberShipMonths = months;
        monthlyFee = fee;
    }

    void extendMembership(int months) {
        memberShipMonths += months;
    }

    double calculateTotalFees() {
        return memberShipMonths * monthlyFee;
    }

    void showMember() {
        System.out.println("Name: " + name);
        System.out.println("MemberShipMonths: " + memberShipMonths);
        System.out.println("MonthlyFee: " + monthlyFee);
    }

}

public class Task_3 {

    public static void main(String arg[]) {

        System.out.println("Md. Nafijur Rahaman\n\n");

        Member m1 = new Member();
        m1.setMember("Tanjid", 5, 1000);
        m1.showMember();
        System.out.println("Before months extend: " + m1.memberShipMonths);
        m1.extendMembership(5);
        System.out.println("After months extend: " + m1.memberShipMonths);
        System.out.println("Total Fees: " + m1.calculateTotalFees());
        System.out.println("\n\nId: 20234103116");

    }

}
