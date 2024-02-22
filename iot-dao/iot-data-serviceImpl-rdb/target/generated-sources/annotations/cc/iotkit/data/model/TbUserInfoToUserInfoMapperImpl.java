package cc.iotkit.data.model;

import cc.iotkit.model.UserInfo;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:20+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class TbUserInfoToUserInfoMapperImpl implements TbUserInfoToUserInfoMapper {

    @Override
    public UserInfo convert(TbUserInfo source) {
        if ( source == null ) {
            return null;
        }

        UserInfo userInfo = new UserInfo();

        userInfo.setCreateDept( source.getCreateDept() );
        userInfo.setCreateBy( source.getCreateBy() );
        userInfo.setCreateTime( source.getCreateTime() );
        userInfo.setUpdateBy( source.getUpdateBy() );
        userInfo.setUpdateTime( source.getUpdateTime() );
        userInfo.setTenantId( source.getTenantId() );
        userInfo.setId( source.getId() );
        userInfo.setUid( source.getUid() );
        userInfo.setSecret( source.getSecret() );
        userInfo.setNickName( source.getNickName() );
        userInfo.setGender( source.getGender() );
        userInfo.setAvatarUrl( source.getAvatarUrl() );
        userInfo.setEmail( source.getEmail() );
        userInfo.setAddress( source.getAddress() );
        userInfo.setCurrHomeId( source.getCurrHomeId() );
        userInfo.setType( source.getType() );

        return userInfo;
    }

    @Override
    public UserInfo convert(TbUserInfo source, UserInfo target) {
        if ( source == null ) {
            return target;
        }

        target.setCreateDept( source.getCreateDept() );
        target.setCreateBy( source.getCreateBy() );
        target.setCreateTime( source.getCreateTime() );
        target.setUpdateBy( source.getUpdateBy() );
        target.setUpdateTime( source.getUpdateTime() );
        target.setTenantId( source.getTenantId() );
        target.setId( source.getId() );
        target.setUid( source.getUid() );
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
