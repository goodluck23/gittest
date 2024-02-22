package cc.iotkit.model.ota;

import cc.iotkit.data.model.TbDeviceOtaDetail;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:20+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class DeviceOtaDetailToTbDeviceOtaDetailMapperImpl implements DeviceOtaDetailToTbDeviceOtaDetailMapper {

    @Override
    public TbDeviceOtaDetail convert(DeviceOtaDetail arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TbDeviceOtaDetail tbDeviceOtaDetail = new TbDeviceOtaDetail();

        tbDeviceOtaDetail.setId( arg0.getId() );
        tbDeviceOtaDetail.setStep( arg0.getStep() );
        tbDeviceOtaDetail.setTaskId( arg0.getTaskId() );
        tbDeviceOtaDetail.setDesc( arg0.getDesc() );
        tbDeviceOtaDetail.setVersion( arg0.getVersion() );
        tbDeviceOtaDetail.setModule( arg0.getModule() );
        tbDeviceOtaDetail.setDeviceId( arg0.getDeviceId() );
        tbDeviceOtaDetail.setProductKey( arg0.getProductKey() );
        tbDeviceOtaDetail.setDeviceName( arg0.getDeviceName() );
        tbDeviceOtaDetail.setOtaInfoId( arg0.getOtaInfoId() );

        return tbDeviceOtaDetail;
    }

    @Override
    public TbDeviceOtaDetail convert(DeviceOtaDetail arg0, TbDeviceOtaDetail arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setStep( arg0.getStep() );
        arg1.setTaskId( arg0.getTaskId() );
        arg1.setDesc( arg0.getDesc() );
        arg1.setVersion( arg0.getVersion() );
        arg1.setModule( arg0.getModule() );
        arg1.setDeviceId( arg0.getDeviceId() );
        arg1.setProductKey( arg0.getProductKey() );
        arg1.setDeviceName( arg0.getDeviceName() );
        arg1.setOtaInfoId( arg0.getOtaInfoId() );

        return arg1;
    }
}
