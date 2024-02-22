package cc.iotkit.data.model;

import cc.iotkit.model.ota.OtaPackage;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:20+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class TbOtaPackageToOtaPackageMapperImpl implements TbOtaPackageToOtaPackageMapper {

    @Override
    public OtaPackage convert(TbOtaPackage arg0) {
        if ( arg0 == null ) {
            return null;
        }

        OtaPackage otaPackage = new OtaPackage();

        otaPackage.setId( arg0.getId() );
        otaPackage.setSize( arg0.getSize() );
        otaPackage.setSign( arg0.getSign() );
        otaPackage.setIsDiff( arg0.getIsDiff() );
        otaPackage.setMd5( arg0.getMd5() );
        otaPackage.setName( arg0.getName() );
        otaPackage.setDesc( arg0.getDesc() );
        otaPackage.setVersion( arg0.getVersion() );
        otaPackage.setUrl( arg0.getUrl() );
        otaPackage.setSignMethod( arg0.getSignMethod() );
        otaPackage.setModule( arg0.getModule() );
        otaPackage.setExtData( arg0.getExtData() );
        otaPackage.setCreateAt( arg0.getCreateAt() );
        otaPackage.setProductKey( arg0.getProductKey() );

        return otaPackage;
    }

    @Override
    public OtaPackage convert(TbOtaPackage arg0, OtaPackage arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setSize( arg0.getSize() );
        arg1.setSign( arg0.getSign() );
        arg1.setIsDiff( arg0.getIsDiff() );
        arg1.setMd5( arg0.getMd5() );
        arg1.setName( arg0.getName() );
        arg1.setDesc( arg0.getDesc() );
        arg1.setVersion( arg0.getVersion() );
        arg1.setUrl( arg0.getUrl() );
        arg1.setSignMethod( arg0.getSignMethod() );
        arg1.setModule( arg0.getModule() );
        arg1.setExtData( arg0.getExtData() );
        arg1.setCreateAt( arg0.getCreateAt() );
        arg1.setProductKey( arg0.getProductKey() );

        return arg1;
    }
}
