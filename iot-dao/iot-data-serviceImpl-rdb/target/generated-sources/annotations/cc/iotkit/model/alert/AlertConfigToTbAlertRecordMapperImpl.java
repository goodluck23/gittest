package cc.iotkit.model.alert;

import cc.iotkit.data.model.TbAlertRecord;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:19+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class AlertConfigToTbAlertRecordMapperImpl implements AlertConfigToTbAlertRecordMapper {

    @Override
    public TbAlertRecord convert(AlertConfig arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TbAlertRecord tbAlertRecord = new TbAlertRecord();

        tbAlertRecord.setId( arg0.getId() );
        tbAlertRecord.setUid( arg0.getUid() );
        tbAlertRecord.setName( arg0.getName() );
        tbAlertRecord.setLevel( arg0.getLevel() );

        return tbAlertRecord;
    }

    @Override
    public TbAlertRecord convert(AlertConfig arg0, TbAlertRecord arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setUid( arg0.getUid() );
        arg1.setName( arg0.getName() );
        arg1.setLevel( arg0.getLevel() );

        return arg1;
    }
}
