package org.mycola.hebrewcards.setup;

import jakarta.persistence.*;
import jakarta.persistence.metamodel.Metamodel;
import org.hibernate.*;
import org.hibernate.Cache;
import org.hibernate.boot.spi.SessionFactoryOptions;
import org.hibernate.engine.spi.FilterDefinition;
import org.hibernate.graph.RootGraph;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;
import org.hibernate.relational.SchemaManager;
import org.hibernate.stat.Statistics;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.naming.NamingException;
import javax.naming.Reference;
import java.sql.Connection;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Configuration
public class HyberFactorySetup {

//    @Bean
//public SessionFactory sessionFactory() {
//        return new SessionFactory() {
//            @Override
//            public Reference getReference() throws NamingException {
//                return null;
//            }
//
//            @Override
//            public SessionBuilder withOptions() {
//                return null;
//            }
//
//            @Override
//            public Session openSession() throws HibernateException {
//                return null;
//            }
//
//            @Override
//            public Session getCurrentSession() throws HibernateException {
//                return null;
//            }
//
//            @Override
//            public StatelessSessionBuilder withStatelessOptions() {
//                return null;
//            }
//
//            @Override
//            public StatelessSession openStatelessSession() {
//                return null;
//            }
//
//            @Override
//            public StatelessSession openStatelessSession(Connection connection) {
//                return null;
//            }
//
//            @Override
//            public Statistics getStatistics() {
//                return null;
//            }
//
//            @Override
//            public SchemaManager getSchemaManager() {
//                return null;
//            }
//
//            @Override
//            public EntityManager createEntityManager() {
//                return null;
//            }
//
//            @Override
//            public EntityManager createEntityManager(Map map) {
//                return null;
//            }
//
//            @Override
//            public EntityManager createEntityManager(SynchronizationType synchronizationType) {
//                return null;
//            }
//
//            @Override
//            public EntityManager createEntityManager(SynchronizationType synchronizationType, Map map) {
//                return null;
//            }
//
//            @Override
//            public HibernateCriteriaBuilder getCriteriaBuilder() {
//                return null;
//            }
//
//            @Override
//            public Metamodel getMetamodel() {
//                return null;
//            }
//
//            @Override
//            public boolean isOpen() {
//                return false;
//            }
//
//            @Override
//            public void close() throws HibernateException {
//
//            }
//
//            @Override
//            public Map<String, Object> getProperties() {
//                return Map.of();
//            }
//
//            @Override
//            public boolean isClosed() {
//                return false;
//            }
//
//            @Override
//            public Cache getCache() {
//                return null;
//            }
//
//            @Override
//            public PersistenceUnitUtil getPersistenceUnitUtil() {
//                return null;
//            }
//
//            @Override
//            public void addNamedQuery(String name, Query query) {
//
//            }
//
//            @Override
//            public <T> T unwrap(Class<T> cls) {
//                return null;
//            }
//
//            @Override
//            public <T> void addNamedEntityGraph(String graphName, EntityGraph<T> entityGraph) {
//
//            }
//
//            @Override
//            public <T> List<EntityGraph<? super T>> findEntityGraphsByType(Class<T> entityClass) {
//                return List.of();
//            }
//
//            @Override
//            public RootGraph<?> findEntityGraphByName(String name) {
//                return null;
//            }
//
//            @Override
//            public Set<String> getDefinedFilterNames() {
//                return Set.of();
//            }
//
//            @Override
//            public FilterDefinition getFilterDefinition(String filterName) throws HibernateException {
//                return null;
//            }
//
//            @Override
//            public Set<String> getDefinedFetchProfileNames() {
//                return Set.of();
//            }
//
//            @Override
//            public SessionFactoryOptions getSessionFactoryOptions() {
//                return null;
//            }
//        };
//    }

}
