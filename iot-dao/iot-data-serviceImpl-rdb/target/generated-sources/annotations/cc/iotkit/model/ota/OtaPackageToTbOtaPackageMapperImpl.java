package cc.iotkit.model.ota;

import cc.iotkit.data.model.TbOtaPackage;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:18+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class OtaPackageToTbOtaPackageMapperImpl implements OtaPackageToTbOtaPackageMapper {

    @Override
    public TbOtaPackage convert(OtaPackage arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TbOtaPackage tbOtaPackage = new TbOtaPackage();

        tbOtaPackage.setId( arg0.getId() );
        tbOtaPackage.setSize( arg0.getSize() );
        tbOtaPackage.setSign( arg0.getSign() );
        tbOtaPackage.setIsDiff( arg0.getIsDiff() );
        tbOtaPackage.setMd5( arg0.getMd5() );
        tbOtaPackage.setName( arg0.getName() );
        tbOtaPackage.setDesc( arg0.getDesc() );
        tbOtaPackage.setVersion( arg0.getVersion() );
        tbOtaPackage.setUrl( arg0.getUrl() );
        tbOtaPackage.setSignMethod( arg0.getSignMethod() );
        tbOtaPackage.setModule( arg0.getModule() );
        tbOtaPackage.setProductKey( arg0.getProductKey() );
        tbOtaPackage.setExtData( arg0.getExtData() );
        tbOtaPackage.setCreateAt( arg0.getCreateAt() );

        return tbOtaPackage;
    }

    @Override
    public TbOtaPackage convert(OtaPackage arg0, TbOtaPackage arg1) {
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
        arg1.setProductKey( arg0.getProductKey() );
        arg1.setExtData( arg0.getExtData() );
        arg1.setCreateAt( arg0.getCreateAt() );

        return arg1;
    }
}
