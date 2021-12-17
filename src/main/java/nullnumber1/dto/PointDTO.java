package nullnumber1.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

@Data
public class PointDTO implements Serializable {

    private double x;
    private double y;
    private double r;
    private LocalDateTime ldt;
    private Boolean hit;
    private Double scriptTime;
    private Integer offset;

    public static Builder newBuilder() {
        return new PointDTO().new Builder();
    }

    public String getLocalDateTimeFormatted() {
        return ldt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PointDTO pointDTO = (PointDTO) o;
        return Double.compare(pointDTO.x, x) == 0 && Double.compare(pointDTO.y, y) == 0 && Double.compare(pointDTO.r, r) == 0
                && Objects.equals(ldt, pointDTO.ldt) && Objects.equals(hit, pointDTO.hit)
                && Objects.equals(scriptTime, pointDTO.scriptTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, r, ldt, hit, scriptTime);
    }

    @Data
    public class Builder {
        private Builder() {
            // private constructor
        }

        public Builder setX(double x) {
            PointDTO.this.x = x;
            return this;
        }

        public Builder setY(double y) {
            PointDTO.this.y = y;
            return this;
        }

        public Builder setR(double r) {
            PointDTO.this.r = r;
            return this;
        }

        public Builder setHit(boolean Hit) {
            PointDTO.this.hit = Hit;
            return this;
        }

        public Builder setLocalDateTime(LocalDateTime ldt) {
            PointDTO.this.ldt = ldt;
            return this;
        }

        public Builder setOffset(Integer offset) {
            PointDTO.this.offset = offset;
            return this;
        }

        public Builder setScriptTime(Double scriptTime) {
            PointDTO.this.scriptTime = scriptTime;
            return this;
        }

        public PointDTO build() {
            return PointDTO.this;
        }
    }
}
