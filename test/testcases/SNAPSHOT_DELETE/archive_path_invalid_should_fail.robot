*** Settings ***
Documentation     Test JBoss delete snapshot.
Suite Setup       Suite Setup
Suite Teardown    Run Keywords    Delete folder    ${AGENT_DIR}${/}snapshot    AND    Stop Server    Standalone
Force Tags        SNAPSHOT_DELETE    win    unix
Test Template     archive_path_invalid_should_fail
Resource          ../../resources/keywords.txt
Resource          shared_template.robot

*** Test Cases ***    ARCHIVE_PATH      RETURN STATUS      RETURN CODE
Archive path not correct
                      C:${/}NOTFOUND    ${ENDED_NOT_OK}    1

*** Key Words ***
archive_path_invalid_should_fail
    [Arguments]    ${archive_path}    ${returnStatus}    ${returnCode}
    @{snapshot_info}=    Config a valid application workflow
    Add Custom Variable    @snapshot/variables/archivepath    ${archive_path}
    Common testsuites execute and assert    ${returnStatus}    ${returnCode}
    [Teardown]    Run Keyword Unless    '@{snapshot_info}[0]' == '${EMPTY}'    Clean Snapshot    @{snapshot_info}[0]    @{snapshot_info}[1]
