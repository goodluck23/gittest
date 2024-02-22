package cc.iotkit.model.ota;

import cc.iotkit.data.model.TbDeviceOtaInfo;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:18+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class DeviceOtaInfoToTbDeviceOtaInfoMapperImpl implements DeviceOtaInfoToTbDeviceOtaInfoMapper {

    @Override
    public TbDeviceOtaInfo convert(DeviceOtaInfo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TbDeviceOtaInfo tbDeviceOtaInfo = new TbDeviceOtaInfo();

        tbDeviceOtaInfo.setId( arg0.getId() );
        tbDeviceOtaInfo.setPackageId( arg0.getPackageId() );
        tbDeviceOtaInfo.setDesc( arg0.getDesc() );
        tbDeviceOtaInfo.setVersion( arg0.getVersion() );
        tbDeviceOtaInfo.setModule( arg0.getModule() );
        tbDeviceOtaInfo.setTotal( arg0.getTotal() );
        tbDeviceOtaInfo.setSuccess( arg0.getSuccess() );
        tbDeviceOtaInfo.setFail( arg0.getFail() );
        tbDeviceOtaInfo.setProductKey( arg0.getProductKey() );
        tbDeviceOtaInfo.setCreateAt( arg0.getCreateAt() );

        return tbDeviceOtaInfo;
    }

    @Override
    public TbDeviceOtaInfo convert(DeviceOtaInfo arg0, TbDeviceOtaInfo arg1) {
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
