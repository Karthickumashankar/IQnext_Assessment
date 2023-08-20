package com.example.FIFA.service;

import com.example.FIFA.dao.StatisticsDao;
import com.example.FIFA.dao.StatisticsDaoImpl;
import com.example.FIFA.dto.AllPlayerStatisticsDto;
import com.example.FIFA.dto.CommonResponseObject;
import com.example.FIFA.model.StatisticsModel;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatisticsService {
    private static final Logger logger = LoggerFactory.getLogger(StatisticsModel.class);

    @Autowired
    StatisticsDaoImpl statisticsDao;

    HttpStatus httpStatus=HttpStatus.OK;
    @Transactional
    public ResponseEntity<?> getAllPlayerStatistics()
    {
        AllPlayerStatisticsDto responseObject=new AllPlayerStatisticsDto();
        try
        {
            List<StatisticsModel> statisticsModel= statisticsDao.getAllPlayerStatistics();
            if(statisticsModel!=null && !statisticsModel.isEmpty())
            {
                responseObject.setAllPlayerList(statisticsModel);
                responseObject.setStatus(true);
                responseObject.setMessage("Status Success");
                httpStatus= HttpStatus.FOUND;
            }
            else
            {
                responseObject.setStatus(false);
                httpStatus=HttpStatus.NOT_FOUND;
                responseObject.setMessage("No player exist");
            }
        }
        catch (Exception e)
        {
            responseObject.setMessage("Invalid Input");
            httpStatus=HttpStatus.INTERNAL_SERVER_ERROR;
            logger.error("Status Failed", e);
        }
        return new ResponseEntity<>(responseObject,httpStatus);
    }

    @Transactional
    public ResponseEntity<?> getPlayerStatisticsById(String id)
    {
        CommonResponseObject responseObject=new CommonResponseObject();
        try
        {
            long idLong=Long.parseLong(id);
            StatisticsModel statisticsModel= statisticsDao.getPlayerStatisticsById(idLong);
            if(statisticsModel !=null)
            {
                responseObject.setPlayerData(statisticsModel);
                responseObject.setStatus(true);
                responseObject.setMessage("Status Success");
                httpStatus= HttpStatus.FOUND;
            }
            else
            {
                responseObject.setStatus(false);
                httpStatus=HttpStatus.NOT_FOUND;
                responseObject.setMessage("No player in that id exist");
            }
        }
        catch (Exception e)
        {
            responseObject.setMessage("Invalid Input");
            httpStatus=HttpStatus.INTERNAL_SERVER_ERROR;
            logger.error("Status Failed", e);
        }
        return new ResponseEntity<>(responseObject,httpStatus);
    }
    @Transactional
    public ResponseEntity<?> getPlayerStatisticsByGames(String games)
    {
        AllPlayerStatisticsDto responseObject=new AllPlayerStatisticsDto();
        try
        {
            Integer game=Integer.valueOf(games);
            List<StatisticsModel> statisticsModel= statisticsDao.getPlayerStatisticsByGames(game);
            if(statisticsModel!=null && !statisticsModel.isEmpty())
            {
                responseObject.setAllPlayerList(statisticsModel);
                responseObject.setStatus(true);
                responseObject.setMessage("Status Success");
                httpStatus= HttpStatus.FOUND;
            }
            else
            {
                responseObject.setStatus(false);
                httpStatus=HttpStatus.NOT_FOUND;
                responseObject.setMessage("No player in that games exist");
            }
        }
        catch (Exception e)
        {
            responseObject.setMessage("Invalid Input");
            httpStatus=HttpStatus.INTERNAL_SERVER_ERROR;
            logger.error("Status Failed", e);
        }
        return new ResponseEntity<>(responseObject,httpStatus);
    }

    @Transactional
    public ResponseEntity<?> getPlayerStatisticsByBirthYear(String birthYear)
    {
        AllPlayerStatisticsDto responseObject=new AllPlayerStatisticsDto();
        try
        {
            Integer birthYearInt=Integer.valueOf(birthYear);
            List<StatisticsModel> statisticsModel= statisticsDao.getPlayerStatisticsByBirthYear(birthYearInt);
            if(statisticsModel!=null && !statisticsModel.isEmpty())
            {
                responseObject.setAllPlayerList(statisticsModel);
                responseObject.setStatus(true);
                responseObject.setMessage("Status Success");
                httpStatus= HttpStatus.FOUND;
            }
            else
            {
                responseObject.setStatus(false);
                httpStatus=HttpStatus.NOT_FOUND;
                responseObject.setMessage("No player in that Birst year exist");
            }
        }
        catch (Exception e)
        {
            responseObject.setMessage("Invalid Input");
            httpStatus=HttpStatus.INTERNAL_SERVER_ERROR;
            logger.error("Status Failed", e);
        }
        return new ResponseEntity<>(responseObject,httpStatus);
    }


    @Transactional
    public ResponseEntity<?> getPlayerStatisticsByMinutes(String minutes)
    {
        AllPlayerStatisticsDto responseObject=new AllPlayerStatisticsDto();
        try
        {
            Integer minutesInt=Integer.valueOf(minutes);
            List<StatisticsModel> statisticsModel= statisticsDao.getPlayerStatisticsByMinutes(minutesInt);
            if(statisticsModel!=null && !statisticsModel.isEmpty())
            {
                responseObject.setAllPlayerList(statisticsModel);
                responseObject.setStatus(true);
                responseObject.setMessage("Status Success");
                httpStatus= HttpStatus.FOUND;
            }
            else
            {
                responseObject.setStatus(false);
                httpStatus=HttpStatus.NOT_FOUND;
                responseObject.setMessage("No player in that minutes exist");
            }
        }
        catch (Exception e)
        {
            responseObject.setMessage("Invalid Input");
            httpStatus=HttpStatus.INTERNAL_SERVER_ERROR;
            logger.error("Status Failed", e);
        }
        return new ResponseEntity<>(responseObject,httpStatus);
    }

    @Transactional
    public ResponseEntity<?> getPlayerStatisticsByGoals(String goals)
    {
        AllPlayerStatisticsDto responseObject=new AllPlayerStatisticsDto();
        try
        {
            Integer goalsInt=Integer.valueOf(goals);
            List<StatisticsModel> statisticsModel= statisticsDao.getPlayerStatisticsByGoals(goalsInt);
            if(statisticsModel!=null && !statisticsModel.isEmpty())
            {
                responseObject.setAllPlayerList(statisticsModel);
                responseObject.setStatus(true);
                responseObject.setMessage("Status Success");
                httpStatus= HttpStatus.FOUND;
            }
            else
            {
                responseObject.setStatus(false);
                httpStatus=HttpStatus.NOT_FOUND;
                responseObject.setMessage("No player in that goals exist");
            }
        }
        catch (Exception e)
        {
            responseObject.setMessage("Invalid Input");
            httpStatus=HttpStatus.INTERNAL_SERVER_ERROR;
            logger.error("Status Failed", e);
        }
        return new ResponseEntity<>(responseObject,httpStatus);
    }

}

