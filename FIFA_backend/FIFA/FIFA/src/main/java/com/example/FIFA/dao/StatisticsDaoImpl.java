package com.example.FIFA.dao;

import com.example.FIFA.model.StatisticsModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StatisticsDaoImpl implements StatisticsDao
{
    private static final Logger logger = LoggerFactory.getLogger(StatisticsModel.class);

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public List<StatisticsModel> getAllPlayerStatistics()
    {
        Session sessions = null;
        try
        {
            sessions = sessionFactory.openSession();
            String queryStr = "FROM StatisticsModel";
            Query<StatisticsModel> resultantPlayer = sessions.createQuery(queryStr, StatisticsModel.class);
            List<StatisticsModel> PlayerData = resultantPlayer.getResultList();
            return PlayerData;
        }
        catch (Exception e)
        {
            logger.error("Status Failed", e);
        }
        finally
        {
            if (sessions.isOpen())
            {
                sessions.close();
            }
        }
        return null;
    }
    @Override
    public StatisticsModel getPlayerStatisticsById(Long id)
    {
        Session session = null;
        try {
            session = sessionFactory.openSession();
            StatisticsModel resultantPlayer = session.get(StatisticsModel.class, id);
            return resultantPlayer;
        }
        catch (Error e)
        {
            logger.error("Status Failed", e);

        }
        finally
        {
            if (session.isOpen())
            {
                session.close();
            }
        }
        return null;
    }


    @Override
    public List<StatisticsModel> getPlayerStatisticsByGames(Integer games)
    {
        Session sessions = null;
        try
        {
            sessions = sessionFactory.openSession();
            String queryStr="FROM StatisticsModel WHERE games="+games;
            Query<StatisticsModel> resultantPlayer = sessions.createQuery(queryStr, StatisticsModel.class);
            List<StatisticsModel> PlayerData = resultantPlayer.getResultList();
            return PlayerData;
        }
        catch (Exception e)
        {
            logger.error("Status Failed", e);
        }
        finally
        {
            if (sessions.isOpen())
            {
                sessions.close();
            }
        }
        return null;
    }
    @Override
    public List<StatisticsModel> getPlayerStatisticsByBirthYear(Integer birthYear)
    {
        Session sessions = null;
        try
        {
            sessions = sessionFactory.openSession();
            String queryStr="FROM StatisticsModel WHERE birthYear="+birthYear;
            Query<StatisticsModel> resultantPlayer = sessions.createQuery(queryStr, StatisticsModel.class);
            List<StatisticsModel> PlayerData = resultantPlayer.getResultList();
            return PlayerData;
        }
        catch (Exception e)
        {
            logger.error("Status Failed", e);
        }
        finally
        {
            if (sessions.isOpen())
            {
                sessions.close();
            }
        }
        return null;
    }

    @Override
    public List<StatisticsModel> getPlayerStatisticsByMinutes(Integer minutes)
    {
        Session sessions = null;
        try
        {
            sessions = sessionFactory.openSession();
            String queryStr="FROM StatisticsModel WHERE minutes="+minutes;
            Query<StatisticsModel> resultantPlayer = sessions.createQuery(queryStr, StatisticsModel.class);
            List<StatisticsModel> PlayerData = resultantPlayer.getResultList();
            return PlayerData;
        }
        catch (Exception e)
        {
            logger.error("Status Failed", e);
        }
        finally
        {
            if (sessions.isOpen())
            {
                sessions.close();
            }
        }
        return null;
    }

    @Override
    public List<StatisticsModel> getPlayerStatisticsByGoals(Integer goals)
    {
        Session sessions = null;
        try
        {
            sessions = sessionFactory.openSession();
            String queryStr="FROM StatisticsModel WHERE goals="+goals;
            Query<StatisticsModel> resultantPlayer = sessions.createQuery(queryStr, StatisticsModel.class);
            List<StatisticsModel> PlayerData = resultantPlayer.getResultList();
            return PlayerData;
        }
        catch (Exception e)
        {
            logger.error("Status Failed", e);
        }
        finally
        {
            if (sessions.isOpen())
            {
                sessions.close();
            }
        }
        return null;
    }
}
