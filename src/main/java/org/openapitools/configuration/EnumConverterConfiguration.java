package org.openapitools.configuration;

import org.openapitools.model.Lang;
import org.openapitools.model.Platform;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

@Configuration
public class EnumConverterConfiguration {

    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.langConverter")
    Converter<Integer, Lang> langConverter() {
        return new Converter<Integer, Lang>() {
            @Override
            public Lang convert(Integer source) {
                return Lang.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.platformConverter")
    Converter<String, Platform> platformConverter() {
        return new Converter<String, Platform>() {
            @Override
            public Platform convert(String source) {
                return Platform.fromValue(source);
            }
        };
    }

}
