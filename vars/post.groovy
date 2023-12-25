 def call(){
   post{
        always{
            mail bcc: '', body: 'build always', cc: '', from: '', replyTo: '', subject: 'build always', to: 'pradeepcoeb@gmail.com'
        }
        success{
            mail bcc: '', body: 'build success', cc: '', from: '', replyTo: '', subject: 'build success', to: 'pradeepcoeb@gmail.com'
        }
        failure{
            mail bcc: '', body: 'build fail', cc: '', from: '', replyTo: '', subject: 'build fail', to: 'pradeepcoeb@gmail.com'
        }
    }
 }
