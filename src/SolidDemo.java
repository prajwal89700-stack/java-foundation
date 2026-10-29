public class SolidDemo {
    interface NotificationService {
        void sendNotification(String message);
    }

   static class EmailNotificationService implements NotificationService {
        @Override
        public void sendNotification(String message) {
            System.out.println("Email sent: " + message);
        }
    }
   static class SmsNotificationService implements NotificationService{
        @Override
        public void sendNotification(String message){
            System.out.println("SMS sent: " + message);
        }
    }
  static class TransactionManager{
        private final NotificationService notifier;
        public TransactionManager(NotificationService notifier){
            this.notifier = notifier;
        }
        void completeTransaction(long amountInPaise){
            long rupees = amountInPaise / 100;
            notifier.sendNotification("Transaction of Rs " + rupees + " completed");
        }
    }
    public static void main(String[] args){
        NotificationService sms = new SmsNotificationService();
        TransactionManager tm = new TransactionManager(sms);
        tm.completeTransaction(50000L);
    }
}