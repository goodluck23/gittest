package cc.iotkit.model.system;

import cc.iotkit.data.model.TbSysLogininfor;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:20+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class SysLoginInfoToTbSysLogininforMapperImpl implements SysLoginInfoToTbSysLogininforMapper {

    @Override
    public TbSysLogininfor convert(SysLoginInfo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TbSysLogininfor tbSysLogininfor = new TbSysLogininfor();

        tbSysLogininfor.setId( arg0.getId() );
        tbSysLogininfor.setTenantId( arg0.getTenantId() );
        tbSysLogininfor.setUserName( arg0.getUserName() );
        tbSysLogininfor.setStatus( arg0.getStatus() );
        tbSysLogininfor.setIpaddr( arg0.getIpaddr() );
        tbSysLogininfor.setLoginLocation( arg0.getLoginLocation() );
        tbSysLogininfor.setBrowser( arg0.getBrowser() );
        tbSysLogininfor.setOs( arg0.getOs() );
        tbSysLogininfor.setMsg( arg0.getMsg() );
        tbSysLogininfor.setLoginTime( arg0.getLoginTime() );

        return tbSysLogininfor;
    }

    @Override
    public TbSysLogininfor convert(SysLoginInfo arg0, TbSysLogininfor arg1) {
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
