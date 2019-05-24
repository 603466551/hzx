package bid.blog521313.hzx.module1.exception;

import lombok.Getter;
import lombok.Setter;

public class HException extends RuntimeException {
    @Setter@Getter
    private int code;

    public HException() {
    }

    public HException(int code) {
        this.code = code;
    }
    public HException(String message) {
        super(message);
    }

    public HException(String message, int code) {
        super(message);
        this.code = code;
    }

}
