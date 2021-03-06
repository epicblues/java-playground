package object.practice10;

import object.practice2.Money;

public class RateDiscountPolicy extends AdditionalRatePolicy{
    private Money discountAmount;

    public RateDiscountPolicy(Money discountAmount,RatePolicy next) {
        super(next);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money afterCalculated(Money fee) {
        return fee.minus(discountAmount);
    }
}
