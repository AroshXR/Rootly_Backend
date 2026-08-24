package com.backend.rootly.entity;

import com.backend.rootly.enums.UnlockConditionType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UnlockCondition {

    @Field("type")
    private UnlockConditionType type;

    @Indexed
    @Field("date")
    private Instant date;

    @Field("location")
    private String location;

    @Field("occasionName")
    private String occasionName;
}
