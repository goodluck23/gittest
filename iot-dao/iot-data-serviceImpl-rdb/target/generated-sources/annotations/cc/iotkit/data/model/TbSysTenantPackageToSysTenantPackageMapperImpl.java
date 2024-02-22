package cc.iotkit.data.model;

import cc.iotkit.model.system.SysTenantPackage;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:19+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class TbSysTenantPackageToSysTenantPackageMapperImpl implements TbSysTenantPackageToSysTenantPackageMapper {

    @Override
    public SysTenantPackage convert(TbSysTenantPackage arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysTenantPackage sysTenantPackage = new SysTenantPackage();

        sysTenantPackage.setCreateDept( arg0.getCreateDept() );
        sysTenantPackage.setCreateBy( arg0.getCreateBy() );
        sysTenantPackage.setCreateTime( arg0.getCreateTime() );
        sysTenantPackage.setUpdateBy( arg0.getUpdateBy() );
        sysTenantPackage.setUpdateTime( arg0.getUpdateTime() );
        sysTenantPackage.setId( arg0.getId() );
        sysTenantPackage.setPackageName( arg0.getPackageName() );
        sysTenantPackage.setMenuIds( arg0.getMenuIds() );
        sysTenantPackage.setRemark( arg0.getRemark() );
        sysTenantPackage.setMenuCheckStrictly( arg0.getMenuCheckStrictly() );
        sysTenantPackage.setStatus( arg0.getStatus() );

        return sysTenantPackage;
    }

    @Override
    public SysTenantPackage convert(TbSysTenantPackage arg0, SysTenantPackage arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setCreateDept( arg0.getCreateDept() );
        arg1.setCreateBy( arg0.getCreateBy() );
        arg1.setCreateTime( arg0.getCreateTime() );
        arg1.setUpdateBy( arg0.getUpdateBy() );
        arg1.setUpdateTime( arg0.getUpdateTime() );
        arg1.setId( arg0.getId() );
        arg1.setPackageName( arg0.getPackageName() );
        arg1.setMenuIds( arg0.getMenuIds() );
        arg1.setRemark( arg0.getRemark() );
        arg1.setMenuCheckStrictly( arg0.getMenuCheckStrictly() );
        arg1.setStatus( arg0.getStatus() );

        return arg1;
    }
}
