package pl.allegro.tech.build.axion.release

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import pl.allegro.tech.build.axion.release.domain.Releaser
import pl.allegro.tech.build.axion.release.infrastructure.di.Context

class PushReleaseTask extends DefaultTask {

    @TaskAction
    void release() {
        Context context = new Context(project)
        
        Releaser releaser = context.releaser()
        releaser.pushRelease(context.config())
    }
    
}
