package cc.iotkit.model;

import cc.iotkit.data.model.TbUserInfo;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:17+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class UserInfoToTbUserInfoMapperImpl implements UserInfoToTbUserInfoMapper {

    @Override
    public TbUserInfo convert(UserInfo source) {
        if ( source == null ) {
            return null;
        }

        TbUserInfo tbUserInfo = new TbUserInfo();

        tbUserInfo.setCreateDept( source.getCreateDept() );
        tbUserInfo.setCreateBy( source.getCreateBy() );
        tbUserInfo.setCreateTime( source.getCreateTime() );
        tbUserInfo.setUpdateBy( source.getUpdateBy() );
        tbUserInfo.setUpdateTime( source.getUpdateTime() );
        tbUserInfo.setId( source.getId() );
        tbUserInfo.setUid( source.getUid() );
        tbUserInfo.setTenantId( source.getTenantId() );
        tbUserInfo.setSecret( source.getSecret() );
        tbUserInfo.setNickName( source.getNickName() );
        tbUserInfo.setGender( source.getGender() );
        tbUserInfo.setAvatarUrl( source.getAvatarUrl() );
        tbUserInfo.setEmail( source.getEmail() );
        tbUserInfo.setAddress( source.getAddress() );
        tbUserInfo.setCurrHomeId( source.getCurrHomeId() );
        tbUserInfo.setType( source.getType() );

        return tbUserInfo;
    }

    @Override
    public TbUserInfo convert(UserInfo source, TbUserInfo target) {
        if ( source == null ) {
            return target;
        }

        target.setCreateDept( source.getCreateDept() );
        target.setCreateBy( source.getCreateBy() );
        target.setCreateTime( source.getCreateTime() );
        target.setUpdateBy( source.getUpdateBy() );
        target.setUpdateTime( source.getUpdateTime() );
        target.setId( source.getId() );
        target.setUid( source.getUid() );
        target.setTenantId( source.getTenantId() );
        target.setSecret( source.getSecret() );
        target.setNickName( source.getNickName() );
        target.setGender( source.getGender() );
        target.setAvatarUrl( source.getAvatarUrl() );
        target.setEmail( source.getEmail() );
        target.setAddress( source.getAddress() );
        target.setCurrHomeId( source.getCurrHomeId() );
        target.setType( source.getType() );

        return target;
    }
}
