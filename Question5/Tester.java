
public class Tester {
    public static void main(String[] args) {
        int _$1_notes_available = 2;
        int _$5_notes_available = 4;
        int purchaseAmount = 21;
        int total_amount_available = _$5_notes_available * 5 + _$1_notes_available;
        if (total_amount_available < purchaseAmount) {
            System.out.println(-1);
        } else {
            int _$5_notes_needed = purchaseAmount / 5;
            int _$1_notes_needed = purchaseAmount - (_$5_notes_needed * 5);

            System.out.println("_$1_notes_needed = " + _$1_notes_needed);
            System.out.println("_$5_notes_needed = " + _$5_notes_needed);
        }
    }
}
