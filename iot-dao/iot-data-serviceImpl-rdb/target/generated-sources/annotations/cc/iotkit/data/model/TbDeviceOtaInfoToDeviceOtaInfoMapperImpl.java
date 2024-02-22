package cc.iotkit.data.model;

import cc.iotkit.model.ota.DeviceOtaInfo;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:19+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class TbDeviceOtaInfoToDeviceOtaInfoMapperImpl implements TbDeviceOtaInfoToDeviceOtaInfoMapper {

    @Override
    public DeviceOtaInfo convert(TbDeviceOtaInfo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        DeviceOtaInfo deviceOtaInfo = new DeviceOtaInfo();

        deviceOtaInfo.setId( arg0.getId() );
        deviceOtaInfo.setPackageId( arg0.getPackageId() );
        deviceOtaInfo.setDesc( arg0.getDesc() );
        deviceOtaInfo.setVersion( arg0.getVersion() );
        deviceOtaInfo.setModule( arg0.getModule() );
        deviceOtaInfo.setTotal( arg0.getTotal() );
        deviceOtaInfo.setSuccess( arg0.getSuccess() );
        deviceOtaInfo.setFail( arg0.getFail() );
        deviceOtaInfo.setProductKey( arg0.getProductKey() );
        deviceOtaInfo.setCreateAt( arg0.getCreateAt() );

        return deviceOtaInfo;
    }

    @Override
    public DeviceOtaInfo convert(TbDeviceOtaInfo arg0, DeviceOtaInfo arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setPackageId( arg0.getPackageId() );
        arg1.setDesc( arg0.getDesc() );
        arg1.setVersion( arg0.getVersion() );
        arg1.setModule( arg0.getModule() );
        arg1.setTotal( arg0.getTotal() );
        arg1.setSuccess( arg0.getSuccess() );
        arg1.setFail( arg0.getFail() );
        arg1.setProductKey( arg0.getProductKey() );
        arg1.setCreateAt( arg0.getCreateAt() );

        return arg1;
    }
}
