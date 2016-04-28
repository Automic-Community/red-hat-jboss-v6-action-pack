*** Settings ***
Documentation     Test JBoss create snapshot action with valid input of Snapshot Mode.
...               Possible valid input is:
...               + APPLICATION
...               + SERVER
...               + BOTH (default)
...               Test case will using above values.
Suite Setup       Suite Setup
Suite Teardown    Run Keywords    Delete folder    ${AGENT_DIR}${/}snapshot    AND    Stop Server    Standalone
Force Tags        SNAPSHOT_LIVE    win    unix
Test Template     Test Snapshot Mode
Resource          ../../resources/keywords.txt
Resource          shared_template.robot

*** Test Cases ***    MODE           RETURN STATUS    RETURN CODE
APPLICATION snapshot mode
                      APPLICATION    ${ENDED_OK}      0

SERVER snapshot mode
                      SERVER         ${ENDED_OK}      0

BOTH snapshot mode    BOTH           ${ENDED_OK}      0
