package nullnumber1;

import nullnumber1.dto.PointDTO;
import nullnumber1.entity.Point;

public class DTOConverter {

    public static Point dtoToEntity(PointDTO pointDTO) {
        return Point.newBuilder()
                .setX(pointDTO.getX())
                .setY(pointDTO.getY())
                .setR(pointDTO.getR())
                .setHit(pointDTO.getHit())
                .setLocalDateTime(pointDTO.getLdt())
                .setScriptTime(pointDTO.getScriptTime())
                .setOffset(pointDTO.getOffset())
                .build();
    }

    public static PointDTO entityToDto(Point point) {
        return PointDTO.newBuilder()
                .setX(point.getX())
                .setY(point.getY())
                .setR(point.getR())
                .setHit(point.getHit())
                .setLocalDateTime(point.getLocalDateTime())
                .setScriptTime(point.getScriptTimeSeconds())
                .setOffset(point.getOffset())
                .build();
    }
}
