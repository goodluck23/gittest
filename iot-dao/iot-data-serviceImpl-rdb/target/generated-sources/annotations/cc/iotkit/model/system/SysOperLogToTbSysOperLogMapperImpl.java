package cc.iotkit.model.system;

import cc.iotkit.data.model.TbSysOperLog;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:19+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class SysOperLogToTbSysOperLogMapperImpl implements SysOperLogToTbSysOperLogMapper {

    @Override
    public TbSysOperLog convert(SysOperLog arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TbSysOperLog tbSysOperLog = new TbSysOperLog();

        tbSysOperLog.setId( arg0.getId() );
        tbSysOperLog.setTenantId( arg0.getTenantId() );
        tbSysOperLog.setTitle( arg0.getTitle() );
        tbSysOperLog.setBusinessType( arg0.getBusinessType() );
        tbSysOperLog.setMethod( arg0.getMethod() );
        tbSysOperLog.setRequestMethod( arg0.getRequestMethod() );
        tbSysOperLog.setOperatorType( arg0.getOperatorType() );
        tbSysOperLog.setOperName( arg0.getOperName() );
        tbSysOperLog.setDeptName( arg0.getDeptName() );
        tbSysOperLog.setOperUrl( arg0.getOperUrl() );
        tbSysOperLog.setOperIp( arg0.getOperIp() );
        tbSysOperLog.setOperLocation( arg0.getOperLocation() );
        tbSysOperLog.setOperParam( arg0.getOperParam() );
        tbSysOperLog.setJsonResult( arg0.getJsonResult() );
        tbSysOperLog.setStatus( arg0.getStatus() );
        tbSysOperLog.setErrorMsg( arg0.getErrorMsg() );
        tbSysOperLog.setOperTime( arg0.getOperTime() );
        tbSysOperLog.setCostTime( arg0.getCostTime() );

        return tbSysOperLog;
    }

    @Override
    public TbSysOperLog convert(SysOperLog arg0, TbSysOperLog arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setTenantId( arg0.getTenantId() );
        arg1.setTitle( arg0.getTitle() );
        arg1.setBusinessType( arg0.getBusinessType() );
        arg1.setMethod( arg0.getMethod() );
        arg1.setRequestMethod( arg0.getRequestMethod() );
        arg1.setOperatorType( arg0.getOperatorType() );
        arg1.setOperName( arg0.getOperName() );
        arg1.setDeptName( arg0.getDeptName() );
        arg1.setOperUrl( arg0.getOperUrl() );
        arg1.setOperIp( arg0.getOperIp() );
        arg1.setOperLocation( arg0.getOperLocation() );
        arg1.setOperParam( arg0.getOperParam() );
        arg1.setJsonResult( arg0.getJsonResult() );
        arg1.setStatus( arg0.getStatus() );
        arg1.setErrorMsg( arg0.getErrorMsg() );
        arg1.setOperTime( arg0.getOperTime() );
        arg1.setCostTime( arg0.getCostTime() );

        return arg1;
    }
}
