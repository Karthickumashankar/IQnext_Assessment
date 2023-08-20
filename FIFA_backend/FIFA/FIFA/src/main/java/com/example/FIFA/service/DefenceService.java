package com.example.FIFA.service;

import com.example.FIFA.dao.DenfenceDaoImpl;
import com.example.FIFA.dao.DenfenceDaoImpl;
import com.example.FIFA.dto.AllPlayerDefenceDto;
import com.example.FIFA.dto.AllPlayerDefenceDto;
import com.example.FIFA.dto.CommonResponseDefenceDto;
import com.example.FIFA.dto.CommonResponseObject;
import com.example.FIFA.model.DefenceModel;
import com.example.FIFA.model.DefenceModel;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefenceService {
    private static final Logger logger = LoggerFactory.getLogger(DefenceModel.class);

    @Autowired
    DenfenceDaoImpl DefenceDao;

    HttpStatus httpStatus=HttpStatus.OK;
    @Transactional
    public ResponseEntity<?> getAllPlayerDefence()
    {
        AllPlayerDefenceDto responseObject=new AllPlayerDefenceDto();
        try
        {
            List<DefenceModel> DefenceModel= DefenceDao.getAllPlayerDefence();
            if(DefenceModel != null && !DefenceModel.isEmpty())
            {
                responseObject.setAllPlayerList(DefenceModel);
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
    public ResponseEntity<?> getPlayerDefenceById(String id)
    {
        CommonResponseDefenceDto responseObject=new CommonResponseDefenceDto();
        try
        {
            long idLong=Long.parseLong(id);
            DefenceModel DefenceModel= DefenceDao.getPlayerDefenceById(idLong);
            if(DefenceModel !=null)
            {
                responseObject.setPlayerData(DefenceModel);
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
    public ResponseEntity<?> getPlayerDefenceByPosition(String position)
    {
        AllPlayerDefenceDto responseObject=new AllPlayerDefenceDto();
        try
        {
            List<DefenceModel> DefenceModel= DefenceDao.getPlayerDefenceByPosition(position);
            if(DefenceModel != null && !DefenceModel.isEmpty())
            {
                responseObject.setAllPlayerList(DefenceModel);
                responseObject.setStatus(true);
                responseObject.setMessage("Status Success");
                httpStatus= HttpStatus.FOUND;
            }
            else
            {
                responseObject.setStatus(false);
                httpStatus=HttpStatus.NOT_FOUND;
                responseObject.setMessage("No player in that position exist");
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
    public ResponseEntity<?> getPlayerDefenceByTeam(String team)
    {
        AllPlayerDefenceDto responseObject=new AllPlayerDefenceDto();
        try
        {
            List<DefenceModel> DefenceModel= DefenceDao.getPlayerDefenceByTeam(team);
            if(DefenceModel != null && !DefenceModel.isEmpty())
            {
                responseObject.setAllPlayerList(DefenceModel);
                responseObject.setStatus(true);
                responseObject.setMessage("Status Success");
                httpStatus= HttpStatus.FOUND;
            }
            else
            {
                responseObject.setStatus(false);
                httpStatus=HttpStatus.NOT_FOUND;
                responseObject.setMessage("No player in that team exist");
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
    public ResponseEntity<?> getPlayerDefenceByTackles(String tackles)
    {
        AllPlayerDefenceDto responseObject=new AllPlayerDefenceDto();
        try
        {
            Integer tacklesInt=Integer.valueOf(tackles);
            List<DefenceModel> DefenceModel= DefenceDao.getPlayerDefenceByTackles(tacklesInt);
            if(DefenceModel != null && !DefenceModel.isEmpty())
            {
                responseObject.setAllPlayerList(DefenceModel);
                responseObject.setStatus(true);
                responseObject.setMessage("Status Success");
                httpStatus= HttpStatus.FOUND;
            }
            else
            {
                responseObject.setStatus(false);
                httpStatus=HttpStatus.NOT_FOUND;
                responseObject.setMessage("No player in that tackles exist");
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
    public ResponseEntity<?> getPlayerDefenceByTacklesWon(String tacklesWon)
    {
        AllPlayerDefenceDto responseObject=new AllPlayerDefenceDto();
        try
        {
            Integer tacklesWonInt=Integer.valueOf(tacklesWon);
            List<DefenceModel> DefenceModel= DefenceDao.getPlayerDefenceByTacklesWon(tacklesWonInt);
            if(DefenceModel != null && !DefenceModel.isEmpty())
            {
                responseObject.setAllPlayerList(DefenceModel);
                responseObject.setStatus(true);
                responseObject.setMessage("Status Success");
                httpStatus= HttpStatus.FOUND;
            }
            else
            {
                responseObject.setStatus(false);
                httpStatus=HttpStatus.NOT_FOUND;
                responseObject.setMessage("No player in that teacklesWon exist");
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
