package cc.iotkit.model.system;

import cc.iotkit.data.model.TbSysTenant;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:21+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class SysTenantToTbSysTenantMapperImpl implements SysTenantToTbSysTenantMapper {

    @Override
    public TbSysTenant convert(SysTenant arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TbSysTenant tbSysTenant = new TbSysTenant();

        tbSysTenant.setCreateDept( arg0.getCreateDept() );
        tbSysTenant.setCreateBy( arg0.getCreateBy() );
        tbSysTenant.setCreateTime( arg0.getCreateTime() );
        tbSysTenant.setUpdateBy( arg0.getUpdateBy() );
        tbSysTenant.setUpdateTime( arg0.getUpdateTime() );
        tbSysTenant.setId( arg0.getId() );
        tbSysTenant.setTenantId( arg0.getTenantId() );
        tbSysTenant.setContactUserName( arg0.getContactUserName() );
        tbSysTenant.setContactPhone( arg0.getContactPhone() );
        tbSysTenant.setCompanyName( arg0.getCompanyName() );
        tbSysTenant.setLicenseNumber( arg0.getLicenseNumber() );
        tbSysTenant.setAddress( arg0.getAddress() );
        tbSysTenant.setDomain( arg0.getDomain() );
        tbSysTenant.setIntro( arg0.getIntro() );
        tbSysTenant.setRemark( arg0.getRemark() );
        tbSysTenant.setPackageId( arg0.getPackageId() );
        tbSysTenant.setExpireTime( arg0.getExpireTime() );
        tbSysTenant.setAccountCount( arg0.getAccountCount() );
        tbSysTenant.setStatus( arg0.getStatus() );

        return tbSysTenant;
    }

    @Override
    public TbSysTenant convert(SysTenant arg0, TbSysTenant arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setCreateDept( arg0.getCreateDept() );
        arg1.setCreateBy( arg0.getCreateBy() );
        arg1.setCreateTime( arg0.getCreateTime() );
        arg1.setUpdateBy( arg0.getUpdateBy() );
        arg1.setUpdateTime( arg0.getUpdateTime() );
        arg1.setId( arg0.getId() );
        arg1.setTenantId( arg0.getTenantId() );
        arg1.setContactUserName( arg0.getContactUserName() );
        arg1.setContactPhone( arg0.getContactPhone() );
        arg1.setCompanyName( arg0.getCompanyName() );
        arg1.setLicenseNumber( arg0.getLicenseNumber() );
        arg1.setAddress( arg0.getAddress() );
        arg1.setDomain( arg0.getDomain() );
        arg1.setIntro( arg0.getIntro() );
        arg1.setRemark( arg0.getRemark() );
        arg1.setPackageId( arg0.getPackageId() );
        arg1.setExpireTime( arg0.getExpireTime() );
        arg1.setAccountCount( arg0.getAccountCount() );
        arg1.setStatus( arg0.getStatus() );

        return arg1;
    }
}
