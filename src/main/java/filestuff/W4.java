package filestuff;

public class W4 {
    int exemptionCnt;          // Number of exemptions
    char filingStatus;        // M - Married, S - Single
                            // X - married but filling
                            //     as single
    double withholdExtra;

    @Override
    public String toString() {
        return "W4{" +
                "exemptionCnt=" + exemptionCnt +
                ", filingStatus=" + filingStatus +
                ", withholdExtra=" + withholdExtra +
                '}';
    }
}
