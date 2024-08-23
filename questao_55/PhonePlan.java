package questao_55;

public class PhonePlan {
    private static final double COST_PER_MINUTE_VAI_VAI = 0.20;
    private static final double COST_PER_MINUTE_OTHER_OPERATOR = 0.65;

    private double monthlyCost = 50.00;

    private int monthlyMinutesQuota = 100;

    private int extraMinutesToVaiVai = 50;

    public double getMonthlyCost() {
        return monthlyCost;
    }

    public int getMonthlyMinutesQuota() {
        return monthlyMinutesQuota;
    }

    public int getExtraMinutesToVaiVai() {
        return extraMinutesToVaiVai;
    }

    public void newCall(CallType typeCall, int qtyMinutes) {
        switch (typeCall) {
            case CallType.ANOTHER_OPERATOR:
                this.handleAnotherOperatorCall(qtyMinutes);
                break;
            case CallType.LAND_LINE:
                this.handleLandLineCall(qtyMinutes);
                break;
            case CallType.VAI_VAI:
                this.handleVaiVaiCall(qtyMinutes);
                break;
        }
    }

    private int adjustMonthlyMinutesQuota(int qtyMinutes) {
        int newMonthlyMinutesQuota = this.monthlyMinutesQuota - qtyMinutes;

        this.monthlyMinutesQuota = Math.max(newMonthlyMinutesQuota, 0);

        return Math.max(-newMonthlyMinutesQuota, 0);
    }

    private int adjustExtraMinutesToVaiVai(int qtyMinutes) {
        int newExtraMinutes = this.extraMinutesToVaiVai - qtyMinutes;

        this.extraMinutesToVaiVai = Math.max(newExtraMinutes, 0);

        return Math.max(-newExtraMinutes, 0);
    }

    private void handleAnotherOperatorCall(int qtyMinutes) {
        int qtyMinutesToCharge = adjustMonthlyMinutesQuota(qtyMinutes);

        if(qtyMinutesToCharge > 0) {
            this.monthlyCost += qtyMinutesToCharge * COST_PER_MINUTE_OTHER_OPERATOR;
        }
    }

    private void handleLandLineCall(int qtyMinutes) {
        qtyMinutes = (int) Math.ceil((double) qtyMinutes / 2);
        int qtyMinutesToCharge = adjustMonthlyMinutesQuota(qtyMinutes);

        if(qtyMinutesToCharge > 0) {
            this.monthlyCost += qtyMinutesToCharge * COST_PER_MINUTE_OTHER_OPERATOR;
        }
    }

    private void handleExtraMinutesToVaiVaVai(int qtyMinutesToCharge) {
        int qtyExtrasMinutesToCharge = adjustExtraMinutesToVaiVai(qtyMinutesToCharge);

        if(qtyExtrasMinutesToCharge > 0) {
            this.monthlyCost += qtyExtrasMinutesToCharge * COST_PER_MINUTE_VAI_VAI;
        }
    }

    private void handleVaiVaiCall(int qtyMinutes) {
        int qtyMinutesToCharge = adjustMonthlyMinutesQuota(qtyMinutes);

        if(qtyMinutesToCharge > 0) {
            handleExtraMinutesToVaiVaVai(qtyMinutesToCharge);
        }
    }
}
