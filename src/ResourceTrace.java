class AuditLogStream implements AutoCloseable {
    private String logFileName;

    public AuditLogStream(String logFileName) {
        this.logFileName = logFileName;
        System.out.println("Log stream opened for: " + this.logFileName);
    }

    public void writeLog(String entry) {
        if (entry == null || entry.trim().isEmpty()) {
            throw new IllegalArgumentException("Log entry cannot be empty");
        }
        System.out.println("Written to log: " + entry);
    }

    @Override
    public void close() {
        System.out.println("[AutoCloseable] Flushing and closing log stream for: " + this.logFileName);
    }
}

public class ResourceTrace {
    public static void main(String[] args) {
        try (AuditLogStream auditLogStream = new AuditLogStream("wallet_audit.log")) {
            auditLogStream.writeLog("Transaction TX101 completed");
            auditLogStream.writeLog("");
        } catch (IllegalArgumentException ex) {
            System.out.println("Caught logging failure: " + ex.getMessage());

        }
        System.out.println("Audit process finished. Server active.");
    }
}
