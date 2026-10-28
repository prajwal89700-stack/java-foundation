class InterfaceDemo {
    interface TaxRule {
        long calculateTax(long amountInPaise);
    }

    static class GstTaxRule implements TaxRule {
        @Override
        public long calculateTax(long amountInPaise) {
            long taxAmount = (amountInPaise * 18) / 100;
            return taxAmount;
        }
    }

    public static void main(String[] args) {
        TaxRule rule = new GstTaxRule();
        System.out.println("GST Tax in paise: " + rule.calculateTax(10000L));
    }
}
