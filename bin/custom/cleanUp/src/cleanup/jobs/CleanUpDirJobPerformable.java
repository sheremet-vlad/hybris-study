package cleanup.jobs;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CleanUpCronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CleanUpDirJobPerformable extends AbstractJobPerformable<CleanUpCronJobModel> {
    private static final Logger LOG = Logger.getLogger(CleanUpDirJobPerformable.class);

    @Override
    public PerformResult perform(CleanUpCronJobModel cleanUpCronJobModel) {
        if (cleanUpCronJobModel.getDirPath() == null || cleanUpCronJobModel.getDirPath().isEmpty()) {
            return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
        }

        Path dirPath = Paths.get(cleanUpCronJobModel.getDirPath());
        try {
            Files.newDirectoryStream(dirPath).forEach(file -> {
                try {
                    Files.delete(file);
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            });
        } catch (IOException e) {
            LOG.error(e.getMessage());
            return new PerformResult(CronJobResult.FAILURE, CronJobStatus.FINISHED);
        }
        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }
}
