package cc.iotkit.data.model;

import cc.iotkit.model.system.SysLoginInfo;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:20+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class TbSysLogininforToSysLoginInfoMapperImpl implements TbSysLogininforToSysLoginInfoMapper {

    @Override
    public SysLoginInfo convert(TbSysLogininfor arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysLoginInfo sysLoginInfo = new SysLoginInfo();

        sysLoginInfo.setId( arg0.getId() );
        sysLoginInfo.setTenantId( arg0.getTenantId() );
        sysLoginInfo.setUserName( arg0.getUserName() );
        sysLoginInfo.setStatus( arg0.getStatus() );
        sysLoginInfo.setIpaddr( arg0.getIpaddr() );
        sysLoginInfo.setLoginLocation( arg0.getLoginLocation() );
        sysLoginInfo.setBrowser( arg0.getBrowser() );
        sysLoginInfo.setOs( arg0.getOs() );
        sysLoginInfo.setMsg( arg0.getMsg() );
        sysLoginInfo.setLoginTime( arg0.getLoginTime() );

        return sysLoginInfo;
    }

    @Override
    public SysLoginInfo convert(TbSysLogininfor arg0, SysLoginInfo arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setTenantId( arg0.getTenantId() );
        arg1.setUserName( arg0.getUserName() );
        arg1.setStatus( arg0.getStatus() );
        arg1.setIpaddr( arg0.getIpaddr() );
        arg1.setLoginLocation( arg0.getLoginLocation() );
        arg1.setBrowser( arg0.getBrowser() );
        arg1.setOs( arg0.getOs() );
        arg1.setMsg( arg0.getMsg() );
        arg1.setLoginTime( arg0.getLoginTime() );

        return arg1;
    }
}
