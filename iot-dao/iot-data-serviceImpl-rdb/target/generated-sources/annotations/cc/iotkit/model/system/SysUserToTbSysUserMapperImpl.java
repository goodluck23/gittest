package cc.iotkit.model.system;

import cc.iotkit.data.model.TbSysUser;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:21+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class SysUserToTbSysUserMapperImpl implements SysUserToTbSysUserMapper {

    @Override
    public TbSysUser convert(SysUser arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TbSysUser tbSysUser = new TbSysUser();

        tbSysUser.setCreateDept( arg0.getCreateDept() );
        tbSysUser.setCreateBy( arg0.getCreateBy() );
        tbSysUser.setCreateTime( arg0.getCreateTime() );
        tbSysUser.setUpdateBy( arg0.getUpdateBy() );
        tbSysUser.setUpdateTime( arg0.getUpdateTime() );
        tbSysUser.setId( arg0.getId() );
        tbSysUser.setTenantId( arg0.getTenantId() );
        tbSysUser.setDeptId( arg0.getDeptId() );
        tbSysUser.setUserName( arg0.getUserName() );
        tbSysUser.setNickName( arg0.getNickName() );
        tbSysUser.setUserType( arg0.getUserType() );
        tbSysUser.setEmail( arg0.getEmail() );
        tbSysUser.setPhonenumber( arg0.getPhonenumber() );
        tbSysUser.setSex( arg0.getSex() );
        tbSysUser.setAvatar( arg0.getAvatar() );
        tbSysUser.setPassword( arg0.getPassword() );
        tbSysUser.setStatus( arg0.getStatus() );
        tbSysUser.setLoginIp( arg0.getLoginIp() );
        tbSysUser.setLoginDate( arg0.getLoginDate() );
        tbSysUser.setRemark( arg0.getRemark() );

        return tbSysUser;
    }

    @Override
    public TbSysUser convert(SysUser arg0, TbSysUser arg1) {
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
        arg1.setDeptId( arg0.getDeptId() );
        arg1.setUserName( arg0.getUserName() );
        arg1.setNickName( arg0.getNickName() );
        arg1.setUserType( arg0.getUserType() );
        arg1.setEmail( arg0.getEmail() );
        arg1.setPhonenumber( arg0.getPhonenumber() );
        arg1.setSex( arg0.getSex() );
        arg1.setAvatar( arg0.getAvatar() );
        arg1.setPassword( arg0.getPassword() );
        arg1.setStatus( arg0.getStatus() );
        arg1.setLoginIp( arg0.getLoginIp() );
        arg1.setLoginDate( arg0.getLoginDate() );
        arg1.setRemark( arg0.getRemark() );

        return arg1;
    }
}
