package com.xindaojia.backend.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Copyright@www.tencent.com.
 *
 * @author:gaiserchen
 * @date:2020/7/23
 * @description:
 */
@Component
@Data
@ConfigurationProperties(prefix = "default")
public class DefaultProperties {

    String username;

    String phone;

    String password;
}
