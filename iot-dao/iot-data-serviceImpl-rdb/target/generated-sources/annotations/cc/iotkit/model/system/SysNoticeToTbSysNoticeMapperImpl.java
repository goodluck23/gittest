package cc.iotkit.model.system;

import cc.iotkit.data.model.TbSysNotice;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:18+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class SysNoticeToTbSysNoticeMapperImpl implements SysNoticeToTbSysNoticeMapper {

    @Override
    public TbSysNotice convert(SysNotice arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TbSysNotice tbSysNotice = new TbSysNotice();

        tbSysNotice.setCreateDept( arg0.getCreateDept() );
        tbSysNotice.setCreateBy( arg0.getCreateBy() );
        tbSysNotice.setCreateTime( arg0.getCreateTime() );
        tbSysNotice.setUpdateBy( arg0.getUpdateBy() );
        tbSysNotice.setUpdateTime( arg0.getUpdateTime() );
        tbSysNotice.setId( arg0.getId() );
        tbSysNotice.setTenantId( arg0.getTenantId() );
        tbSysNotice.setNoticeTitle( arg0.getNoticeTitle() );
        tbSysNotice.setNoticeType( arg0.getNoticeType() );
        tbSysNotice.setNoticeContent( arg0.getNoticeContent() );
        tbSysNotice.setStatus( arg0.getStatus() );
        tbSysNotice.setRemark( arg0.getRemark() );

        return tbSysNotice;
    }

    @Override
    public TbSysNotice convert(SysNotice arg0, TbSysNotice arg1) {
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
        arg1.setNoticeTitle( arg0.getNoticeTitle() );
        arg1.setNoticeType( arg0.getNoticeType() );
        arg1.setNoticeContent( arg0.getNoticeContent() );
        arg1.setStatus( arg0.getStatus() );
        arg1.setRemark( arg0.getRemark() );

        return arg1;
    }
}
