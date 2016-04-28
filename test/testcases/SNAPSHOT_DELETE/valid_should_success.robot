*** Settings ***
Documentation     Test JBoss delete snapshot.
Suite Setup       Suite Setup
Suite Teardown    Run Keywords    Delete folder    ${AGENT_DIR}${/}snapshot
...               AND    Stop Server    Standalone
Force Tags        SNAPSHOT_DELETE    win    unix
Test Template     valid_should_success
Resource          ../../resources/keywords.txt
Resource          shared_template.robot

*** Test Cases ***    RETURN STATUS    RETURN CODE
Normal                ${ENDED_OK}      0

*** Key Words ***
valid_should_success
    [Arguments]    ${returnStatus}    ${returnCode}
    @{snapshot_info}=    Config a valid application workflow
    Common testsuites execute and assert    ${returnStatus}    ${returnCode}
    [Teardown]    Run Keyword Unless    '@{snapshot_info}[0]' == '${EMPTY}'    Clean Snapshot    @{snapshot_info}[0]    @{snapshot_info}[1]
