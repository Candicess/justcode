package generic;

import java.util.Objects;

public class BaseResponse<R, T> {

    private R code;

    private T data;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BaseResponse<?, ?> that = (BaseResponse<?, ?>) o;
        return Objects.equals(code, that.code) &&
                Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, data);
    }
}
