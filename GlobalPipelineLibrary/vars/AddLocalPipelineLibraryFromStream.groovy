def call(def depotName, def streamRoot, def version="now") {
  library changelog: false, identifier: "PipelineCommon@${version}",
    retriever: legacySCM (
      perforce(
        credential: '0ec81880-1930-476c-aaf7-74c3363c0060',
        populate: syncOnly(
          force: true,
          have: true,
          modtime: false,
          parallel: [enable: false],
          pin: '',
          quiet: false,
          revert: false
        ),
        workspace: manualSpec(
          charset: 'none',
          name: 'jenkins-${NODE_NAME}-${JOB_NAME}-PLCLIB',
          pinHost: false,
          spec: clientSpec(
            allwrite: false,
            backup: false,
            clobber: false,
            compress: false,
            line: 'LOCAL',
            locked: false,
            modtime: false,
            rmdir: false,
            serverID: '',
            streamName: '',
            type: 'WRITABLE',
            view:
            '//' + depotName + '/' + streamRoot + '/Game/Engine/Build/Jenkins/LocalPipelineLibrary/... //jenkins-${NODE_NAME}-${JOB_NAME}-PLCLIB/...\n' +
            '//' + depotName + '/' + streamRoot + '/Game/Tools/Build/AutomatedTestParseRules.txt //jenkins-${NODE_NAME}-${JOB_NAME}-PLCLIB/resources/org/trs/pipeline/AutomatedTestParseRules.txt'
          )
        )
      )
    )
}
