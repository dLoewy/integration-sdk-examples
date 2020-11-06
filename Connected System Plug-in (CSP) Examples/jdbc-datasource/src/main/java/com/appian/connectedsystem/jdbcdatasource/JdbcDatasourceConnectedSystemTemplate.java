package com.appian.connectedsystem.jdbcdatasource;

import com.appian.connectedsystems.simplified.sdk.SimpleConnectedSystemTemplate;
import com.appian.connectedsystems.simplified.sdk.configuration.SimpleConfiguration;
import com.appian.connectedsystems.templateframework.sdk.ExecutionContext;
import com.appian.connectedsystems.templateframework.sdk.TemplateId;

@TemplateId(name = "JdbcDatasourceConnectedSystemTemplate")
public class JdbcDatasourceConnectedSystemTemplate extends SimpleConnectedSystemTemplate {

    @Override
    protected SimpleConfiguration getConfiguration(
            SimpleConfiguration simpleConfiguration, ExecutionContext executionContext) {

        return simpleConfiguration.setProperties(
                // Make sure you make public constants for all keys so that associated
                // integrations can easily access this field

                textProperty("name")
                        .label("Name")
                        .description("Example: \"Accounts Database\"")
                        .isRequired(true)
                        .build(),
                textProperty("url")
                        .label("JDBC URL")
//                        .description("This will be concatenated with the integration text property on execute")
                        .isRequired(true)
                        .build(),
                textProperty("username")
                        .label("Username")
//                        .description("This will be concatenated with the integration text property on execute")
                        .isRequired(true)
                        .build(),
                encryptedTextProperty("password")
                        .label("Password")
//                        .description("This will be concatenated with the integration text property on execute")
                        .isRequired(true)
                        .build()
        );
    }
}
