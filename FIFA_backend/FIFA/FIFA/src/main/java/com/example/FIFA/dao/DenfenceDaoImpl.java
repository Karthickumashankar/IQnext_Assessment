package com.example.FIFA.dao;

import com.example.FIFA.model.DefenceModel;
import com.example.FIFA.model.DefenceModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DenfenceDaoImpl implements DefenceDao
{

    private static final Logger logger = LoggerFactory.getLogger(DefenceModel.class);

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public List<DefenceModel> getAllPlayerDefence()
    {
        Session sessions = null;
        try
        {
            sessions = sessionFactory.openSession();
            String queryStr = "FROM DefenceModel";
            Query<DefenceModel> resultantPlayer = sessions.createQuery(queryStr, DefenceModel.class);
            List<DefenceModel> PlayerData = resultantPlayer.getResultList();
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
    public DefenceModel getPlayerDefenceById(Long id)
    {
        Session session = null;
        try {
            session = sessionFactory.openSession();
            DefenceModel resultantPlayer = session.get(DefenceModel.class, id);
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
    public List<DefenceModel> getPlayerDefenceByPosition(String position)
    {
        Session sessions = null;
        try
        {
            sessions = sessionFactory.openSession();
            String queryStr="FROM DefenceModel WHERE position=:POSITION";
            Query<DefenceModel> resultantPlayer = sessions.createQuery(queryStr, DefenceModel.class);
            resultantPlayer.setParameter("POSITION",position);
            List<DefenceModel> PlayerData = resultantPlayer.getResultList();
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
    public List<DefenceModel> getPlayerDefenceByTeam(String team)
    {
        Session sessions = null;
        try
        {
            sessions = sessionFactory.openSession();
            String queryStr="FROM DefenceModel WHERE team=:TEAM";
            Query<DefenceModel> resultantPlayer = sessions.createQuery(queryStr, DefenceModel.class);
            resultantPlayer.setParameter("TEAM",team);
            List<DefenceModel> PlayerData = resultantPlayer.getResultList();
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
    public List<DefenceModel> getPlayerDefenceByTackles(Integer tackles)
    {
        Session sessions = null;
        try
        {
            sessions = sessionFactory.openSession();
            String queryStr="FROM DefenceModel WHERE tackles="+tackles;
            Query<DefenceModel> resultantPlayer = sessions.createQuery(queryStr, DefenceModel.class);
            List<DefenceModel> PlayerData = resultantPlayer.getResultList();
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
    public List<DefenceModel> getPlayerDefenceByTacklesWon(Integer tacklesWon)
    {
        Session sessions = null;
        try
        {
            sessions = sessionFactory.openSession();
            String queryStr="FROM DefenceModel WHERE tacklesWon="+tacklesWon;
            Query<DefenceModel> resultantPlayer = sessions.createQuery(queryStr, DefenceModel.class);
            List<DefenceModel> PlayerData = resultantPlayer.getResultList();
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
