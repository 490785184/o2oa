/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package com.x.okr.entity;

import com.x.base.core.entity.SliceJpaObject_;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=com.x.okr.entity.OkrWorkProcessLink.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Fri Dec 02 16:18:45 CST 2016")
public class OkrWorkProcessLink_ extends SliceJpaObject_  {
    public static volatile SingularAttribute<OkrWorkProcessLink,String> activityName;
    public static volatile SingularAttribute<OkrWorkProcessLink,String> centerId;
    public static volatile SingularAttribute<OkrWorkProcessLink,String> centerTitle;
    public static volatile SingularAttribute<OkrWorkProcessLink,Date> createTime;
    public static volatile SingularAttribute<OkrWorkProcessLink,String> id;
    public static volatile SingularAttribute<OkrWorkProcessLink,Integer> processLevel;
    public static volatile SingularAttribute<OkrWorkProcessLink,String> processorCompanyName;
    public static volatile SingularAttribute<OkrWorkProcessLink,String> processorIdentity;
    public static volatile SingularAttribute<OkrWorkProcessLink,String> processorName;
    public static volatile SingularAttribute<OkrWorkProcessLink,String> processorOrganizationName;
    public static volatile SingularAttribute<OkrWorkProcessLink,String> sequence;
    public static volatile SingularAttribute<OkrWorkProcessLink,String> status;
    public static volatile SingularAttribute<OkrWorkProcessLink,String> title;
    public static volatile SingularAttribute<OkrWorkProcessLink,Date> updateTime;
    public static volatile SingularAttribute<OkrWorkProcessLink,String> workId;
}