*** Settings ***
Documentation     NOTE:
...               add note here
Suite Setup       Suite Setup
Force Tags        DELETE_DATASOURCE    win
Test Template     Delete Datasource Template
Resource          ../../resources/keywords.txt

*** Test Cases ***    MODE          PROFILE      NAME      DSTYPE           FAIL IF MISSING    RETURN CODE    RETURN STATUS
Delete xa datasource
                      Standalone    testds       testds    XA datasource    NO                 0              ${ENDED_OK}

Delete tx datasource
                      Standalone    profiletx    nametx    TX datasource    NO                 0              ${ENDED_OK}

*** Keywords ***
Delete Datasource Template
    [Arguments]    ${mode}    ${profile}    ${name}    ${dstype}    ${fail_ifmissing}    ${returnCode}
    ...    ${returnStatus}
    Init Action    ${ACTION_DELETE_DATASOURCE}
    Action Set    ${PRT_DELETE_DATASOURCE_JBOSS_OPERATING_MODE}    ${mode}
    Action Set    ${PRT_DELETE_DATASOURCE_JBOSS_PROFILE}    ${profile}
    Action Set    ${PRT_DELETE_DATASOURCE_JBOSS_NAME}    ${name}
    Action Set    ${PRT_DELETE_DATASOURCE_JBOSS_DS_TYPE}    ${dstype}
    Action Set    ${PRT_DELETE_DATASOURCE_JBOSS_FAIL_MISSING}    ${fail_ifmissing}
    JBOSS Common Setting With User
    Action Execute
    Action Report Should Be Found
    Action Return Code Should Be    ${returnCode}
    Action Return Status Should Be    ${returnStatus}
