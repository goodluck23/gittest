package cc.iotkit.data.model;

import cc.iotkit.model.ota.DeviceOtaDetail;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:20+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class TbDeviceOtaDetailToDeviceOtaDetailMapperImpl implements TbDeviceOtaDetailToDeviceOtaDetailMapper {

    @Override
    public DeviceOtaDetail convert(TbDeviceOtaDetail arg0) {
        if ( arg0 == null ) {
            return null;
        }

        DeviceOtaDetail deviceOtaDetail = new DeviceOtaDetail();

        deviceOtaDetail.setId( arg0.getId() );
        deviceOtaDetail.setStep( arg0.getStep() );
        deviceOtaDetail.setTaskId( arg0.getTaskId() );
        deviceOtaDetail.setDesc( arg0.getDesc() );
        deviceOtaDetail.setVersion( arg0.getVersion() );
        deviceOtaDetail.setModule( arg0.getModule() );
        deviceOtaDetail.setDeviceId( arg0.getDeviceId() );
        deviceOtaDetail.setProductKey( arg0.getProductKey() );
        deviceOtaDetail.setDeviceName( arg0.getDeviceName() );
        deviceOtaDetail.setOtaInfoId( arg0.getOtaInfoId() );

        return deviceOtaDetail;
    }

    @Override
    public DeviceOtaDetail convert(TbDeviceOtaDetail arg0, DeviceOtaDetail arg1) {
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
